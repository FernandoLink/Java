package br.com.link.escolamongo.repositories;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import br.com.link.escolamongo.codecs.AlunoCodec;
import br.com.link.escolamongo.models.Aluno;

@Repository
public class AlunoRepository {

	private MongoClient client;
	private MongoDatabase database;

	public void salvar(Aluno aluno) {
		criarConexao();
		MongoCollection<Aluno> alunos = this.database.getCollection("alunos", Aluno.class);
		alunos.insertOne(aluno);
		client.close();
	}

	public List<Aluno> obterTodosAlunos() {
		criarConexao();
		MongoCollection<Aluno> alunos = this.database.getCollection("alunos", Aluno.class);

		MongoCursor<Aluno> resultado = alunos.find().iterator();

		List<Aluno> alunosEncontrados = new ArrayList<>();
		while (resultado.hasNext()) {
			Aluno aluno = resultado.next();
			alunosEncontrados.add(aluno);
		}
		client.close();
		return alunosEncontrados;
	}

	public Aluno obterAlunoPor(String id) {
		criarConexao();
		MongoCollection<Aluno> alunos = this.database.getCollection("alunos", Aluno.class);
		Aluno aluno = alunos.find(Filters.eq("_id", new ObjectId(id))).first();
		client.close();
		return aluno;
	}

	public void criarConexao() {
		String connection = "mongodb://root:pass@127.0.0.1:27017/?directConnection=true&serverSelectionTimeoutMS=2000&authSource=admin&appName=mongosh+1.8.0";
		Codec<Document> codec = MongoClientSettings.getDefaultCodecRegistry().get(Document.class);
		AlunoCodec alunoCodec = new AlunoCodec(codec);
		CodecRegistry registro = CodecRegistries.fromRegistries(CodecRegistries.fromCodecs(alunoCodec),
				MongoClientSettings.getDefaultCodecRegistry());
		ConnectionString conn = new ConnectionString(connection);
		MongoClientSettings opcoes = MongoClientSettings.builder().codecRegistry(registro).applyConnectionString(conn)
				.build();
		this.client = MongoClients.create(opcoes);
		this.database = client.getDatabase("test");
	}
}
