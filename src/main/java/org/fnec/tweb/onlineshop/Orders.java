package org.fnec.tweb.onlineshop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private Long pID;
	

	@ManyToOne
	@JoinColumn(name="clientID")
	private Client client;

	protected Orders() {}

	public Orders(Client client, Long pID) {
		this.client = client;
		this.pID = pID;
	}

	@Override
	public String toString() {
		return String.format(
				"Orders[id=%d, clientID=%d, pID='%d']",
				id, client.getId(), pID);
	}
	
	public Long getId() {
		return id;
	}

	public Long getClientID() {
		return client.getId();
	}

	public Long getPID() {
		return pID;
	}
}
