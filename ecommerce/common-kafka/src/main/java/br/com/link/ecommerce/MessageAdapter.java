package br.com.link.ecommerce;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class MessageAdapter implements JsonSerializer<Message>, JsonDeserializer<Message> {

	@Override
	public JsonElement serialize(Message message, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject obj = new JsonObject();
		obj.addProperty("type", message.getPayLoad().getClass().getName());
		obj.add("payload", context.serialize(message.getPayLoad()));
		obj.add("correlationId", context.serialize(message.getId()));
		return obj;
	}

	@Override
	public Message deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		var obj = jsonElement.getAsJsonObject();
		var payloadType = obj.get("type").getAsString();
		var correlationId = (CorrelationId) context.deserialize(obj.get("correlationId"), CorrelationId.class);
		try {
			var payload = context.deserialize(obj.get("payload"), Class.forName(payloadType));
			return new Message(correlationId, payload);
		} catch (ClassNotFoundException e) {
			throw new JsonParseException(e);
		}
	}

}
