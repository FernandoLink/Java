package mongo;

import java.util.Arrays;
import java.util.Date;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class Principal {

	public static void main(String[] args) {

		String connection = "mongodb://root:pass@127.0.0.1:27017/?directConnection=true&serverSelectionTimeoutMS=2000&authSource=admin&appName=mongosh+1.8.0";
		ConnectionString conn = new ConnectionString(connection);
		MongoClient client = MongoClients.create(conn);
		MongoDatabase database = client.getDatabase("test");
		MongoCollection<Document> alunos = database.getCollection("alunos");

		// inserir
		Document aluno = alunos.find().first();
		Document novoAluno = new Document("nome", "Joao").append("data_nascimento", new Date(2003, 10, 10))
				.append("curso", new Document("nome", "Historia")).append("notas", Arrays.asList(10, 9, 8))
				.append("habilidades", Arrays.asList(new Document().append("nome", "Ingles").append("nível", "Básico"),
						new Document().append("nome", "Espanhol").append("nível", "Básico")));
		alunos.insertOne(novoAluno);

		// atualizar
		alunos.updateOne(Filters.eq("nome", "Joao"), new Document("$set", new Document("nome", "Fernando Link")));

		// deletar
		alunos.deleteMany(Filters.eq("nome", "Joao"));
		client.close();
	}
}
