package br.com.link.ecommerce;

public class Message<T> {

	private final CorrelationId id;
	private final T payLoad;

	Message(CorrelationId id, T payLoad) {
		this.id = id;
		this.payLoad = payLoad;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", payLoad=" + payLoad + "]";
	}

	public T getPayLoad() {
		return payLoad;
	}

	public Object getId() {
		return id;
	}

}
