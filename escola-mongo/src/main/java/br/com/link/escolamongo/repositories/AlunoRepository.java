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

	private MongoClient cliente;
	private MongoDatabase bancaDeDados;

	private void criarConexao() {
		String connection = "mongodb://root:pass@127.0.0.1:27017/?directConnection=true&serverSelectionTimeoutMS=2000&authSource=admin&appName=mongosh+1.8.0";
		Codec<Document> codec = MongoClientSettings.getDefaultCodecRegistry().get(Document.class);
		AlunoCodec alunoCodec = new AlunoCodec(codec);
		CodecRegistry registro = CodecRegistries.fromRegistries(CodecRegistries.fromCodecs(alunoCodec),
				MongoClientSettings.getDefaultCodecRegistry());
		ConnectionString conn = new ConnectionString(connection);
		MongoClientSettings opcoes = MongoClientSettings.builder().codecRegistry(registro).applyConnectionString(conn)
				.build();
		this.cliente = MongoClients.create(opcoes);
		this.bancaDeDados = cliente.getDatabase("test");

	}

	public void salvar(Aluno aluno) {

		criarConexao();
		MongoCollection<Aluno> alunos = this.bancaDeDados.getCollection("alunos", Aluno.class);
		if (aluno.getId() == null) {
			alunos.insertOne(aluno);
		} else {
			alunos.updateOne(Filters.eq("_id", aluno.getId()), new Document("$set", aluno));
		}

		fecharConexao();
	}

	public List<Aluno> obterTodosAlunos() {
		criarConexao();
		MongoCollection<Aluno> alunos = this.bancaDeDados.getCollection("alunos", Aluno.class);

		MongoCursor<Aluno> resultados = alunos.find().iterator();

		List<Aluno> alunosEncontrados = popularAlunos(resultados);
		fecharConexao();

		return alunosEncontrados;

	}

	public Aluno obterAlunoPor(String id) {
		criarConexao();
		MongoCollection<Aluno> alunos = this.bancaDeDados.getCollection("alunos", Aluno.class);
		Aluno aluno = alunos.find(Filters.eq("_id", new ObjectId(id))).first();

		return aluno;

	}

	public List<Aluno> pesquisarPor(String nome) {
		criarConexao();
		MongoCollection<Aluno> alunoCollection = this.bancaDeDados.getCollection("alunos", Aluno.class);
		MongoCursor<Aluno> resultados = alunoCollection.find(Filters.eq("nome", nome), Aluno.class).iterator();
		List<Aluno> alunos = popularAlunos(resultados);

		fecharConexao();

		return alunos;
	}

	private void fecharConexao() {
		this.cliente.close();
	}

	private List<Aluno> popularAlunos(MongoCursor<Aluno> resultados) {
		List<Aluno> alunos = new ArrayList<>();
		while (resultados.hasNext()) {
			alunos.add(resultados.next());
		}
		return alunos;
	}

	public List<Aluno> pesquisarPor(String classificacao, double nota) {
		criarConexao();

		MongoCollection<Aluno> alunoCollection = this.bancaDeDados.getCollection("alunos", Aluno.class);

		MongoCursor<Aluno> resultados = null;

		if (classificacao.equals("reprovados")) {
			resultados = alunoCollection.find(Filters.lt("notas", nota)).iterator();
		} else if (classificacao.equals("aprovados")) {
			resultados = alunoCollection.find(Filters.gte("notas", nota)).iterator();
		}

		List<Aluno> alunos = popularAlunos(resultados);

		fecharConexao();

		return alunos;

	}

}
