package com.mng.gwt.ebus.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.mng.gwt.ebus.events.DeclineEvent;
import com.mng.gwt.ebus.events.DeclineEventHandler;
import com.mng.gwt.ebus.model.Kevin;
import com.mng.gwt.ebus.model.Shark;

public class MyEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		final SimpleEventBus eventBus = new SimpleEventBus();
		final Label el = new Label();
		final Button btn = new Button("Make me an offer");
		final Shark shark = new Kevin();
		
		
		
		
		
		RootPanel.get().add(btn);
		RootPanel.get().add(el);
		
		eventBus.addHandler(DeclineEvent.TYPE, new DeclineEventHandler() {
			
			@Override
			public void onImOut(DeclineEvent event) {
				el.setText(shark.out());
				
			}
		});
		
		btn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// broadcast the event
				eventBus.fireEvent(new DeclineEvent());
				
			}
		});
		
		

	}

}
