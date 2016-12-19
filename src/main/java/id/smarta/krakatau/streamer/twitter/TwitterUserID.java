package id.smarta.krakatau.streamer.twitter;

public enum TwitterUserID {
	bekraf(3099316873l),
	kominfo(177848697l),
	rudiantara(2878952809l),
	triawan(29362357l);
	
	private Long userId;

	private TwitterUserID(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return this.userId;
	}
}
