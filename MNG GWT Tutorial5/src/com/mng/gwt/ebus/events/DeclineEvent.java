package com.mng.gwt.ebus.events;

import com.google.gwt.event.shared.GwtEvent;

public class DeclineEvent extends GwtEvent<DeclineEventHandler>{

	public static Type<DeclineEventHandler> TYPE = new Type<DeclineEventHandler>();
	
	
	@Override
	public Type<DeclineEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(DeclineEventHandler handler) {
		handler.onImOut(this);
		
	}

}
