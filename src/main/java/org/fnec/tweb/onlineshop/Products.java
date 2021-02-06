package org.fnec.tweb.onlineshop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String label, desc, typeLabel;
	private float price;
	public int quantity, type;
	
	protected Products() {}

	public Products(int type, String label, float price, int quantity, String desc, String typeLabel) {
		this.type = type;
		this.label = label;
		this.price = price;
		this.quantity = quantity;
		this.desc = desc;
		this.typeLabel = typeLabel;
	}

	@Override
	public String toString() {
		return String.format(
				"Products[id=%d, type='%d', label='%s', price='%f', quantity='%d', desc='%s', typeLabel='%s']",
				id, type, label, price, quantity, desc, typeLabel);
	}
	
	public Long getId() {
		return id;
	}

	public int getType() {
		return type;
	}
	
	public String getLabel() {
		return label;
	}
	
	public float getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public String getDesc() {
		return desc;
	}

	public String getTypeLabel() {
		return typeLabel;
	}
}
