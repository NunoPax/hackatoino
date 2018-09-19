package org.academiadecodigo.socialsaver.persistence.model;

public class Items implements Model {

	private String type;
	private int receiverId;
	private boolean donated = false;

	public boolean isDonated() {
		return donated;
	}

	public void setDonated(boolean donated) {
		this.donated = donated;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	@Override
	public Integer getId() {
		return null;
	}

	@Override
	public void setId(Integer id) {

	}
}
