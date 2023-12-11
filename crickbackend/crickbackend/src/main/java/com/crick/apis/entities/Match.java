package com.crick.apis.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crick_match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;
    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;
    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;


    private Date date=new Date();

    public void setMatchStatus() {
        if (this.textComplete.trim().isBlank()) {
            this.status = MatchStatus.LIVE;
        } else {
            this.status = MatchStatus.COMPLETED;
        }
    }

	public Match(int matchId, String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore,
			String bowlTeam, String bowlTeamScore, String liveText, String matchLink, String textComplete,
			MatchStatus status, Date date) {
		super();
		this.matchId = matchId;
		this.teamHeading = teamHeading;
		this.matchNumberVenue = matchNumberVenue;
		this.battingTeam = battingTeam;
		this.battingTeamScore = battingTeamScore;
		this.bowlTeam = bowlTeam;
		this.bowlTeamScore = bowlTeamScore;
		this.liveText = liveText;
		this.matchLink = matchLink;
		this.textComplete = textComplete;
		this.status = status;
		this.date = date;
	}
	public Match() {
		// TODO Auto-generated constructor stub
	}

	public void Match() {
		
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getTeamHeading() {
		return teamHeading;
	}

	public void setTeamHeading(String teamHeading) {
		this.teamHeading = teamHeading;
	}

	private String getMatchNumberVenue() {
		return matchNumberVenue;
	}

	public void setMatchNumberVenue(String matchNumberVenue) {
		this.matchNumberVenue = matchNumberVenue;
	}

	private String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	private String getBattingTeamScore() {
		return battingTeamScore;
	}

	public void setBattingTeamScore(String battingTeamScore) {
		this.battingTeamScore = battingTeamScore;
	}

	private String getBowlTeam() {
		return bowlTeam;
	}

	public void setBowlTeam(String bowlTeam) {
		this.bowlTeam = bowlTeam;
	}

	private String getBowlTeamScore() {
		return bowlTeamScore;
	}

	public void setBowlTeamScore(String bowlTeamScore) {
		this.bowlTeamScore = bowlTeamScore;
	}

	private String getLiveText() {
		return liveText;
	}

	public void setLiveText(String liveText) {
		this.liveText = liveText;
	}

	private String getMatchLink() {
		return matchLink;
	}

	public void setMatchLink(String matchLink) {
		this.matchLink = matchLink;
	}

	private String getTextComplete() {
		return textComplete;
	}

	public void setTextComplete(String textComplete) {
		this.textComplete = textComplete;
	}

	private MatchStatus getStatus() {
		return status;
	}

	private void setStatus(MatchStatus status) {
		this.status = status;
	}

	private Date getDate() {
		return date;
	}

	private void setDate(Date date) {
		this.date = date;
	}
}
