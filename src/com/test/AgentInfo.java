package com.test;

public class AgentInfo {
    private String agentName;
    private String teamName;

    public AgentInfo(String agentName, String teamName) {
        this.agentName = agentName;
        this.teamName = teamName;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
