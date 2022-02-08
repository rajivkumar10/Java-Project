package com.test;


public class Event {
   private String eventType;
   private AgentInfo agentInfo;

   public Event(String eventType, AgentInfo agentInfo) {
       this.eventType = eventType;
       this.agentInfo = agentInfo;
   }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public AgentInfo getAgentInfo() {
        return agentInfo;
    }

    public void setAgentInfo(AgentInfo agentInfo) {
        this.agentInfo = agentInfo;
    }
}
