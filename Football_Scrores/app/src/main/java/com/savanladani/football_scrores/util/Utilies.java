package com.savanladani.football_scrores.util;

import com.savanladani.football_scrores.R;
import com.savanladani.football_scrores.widgets.App;

public class Utilies {
    public static final int SERIE_A = 357;
    public static final int PREMIER_LEGAUE = 354;
    public static final int CHAMPIONS_LEAGUE = 362;
    public static final int PRIMERA_DIVISION = 358;
    public static final int BUNDESLIGA = 351;

    public static String getLeague(int league_num) {
        switch (league_num) {
            case SERIE_A:
                return App.getContext().getString(R.string.seria_a);
            case PREMIER_LEGAUE:
                return App.getContext().getString(R.string.premier_league);
            case CHAMPIONS_LEAGUE:
                return App.getContext().getString(R.string.uefa_league);
            case PRIMERA_DIVISION:
                return App.getContext().getString(R.string.primear_division);
            case BUNDESLIGA:
                return App.getContext().getString(R.string.bundasliga);
            default:
                return App.getContext().getString(R.string.not_known_league);
        }
    }

    public static String getMatchDay(int match_day, int league_num) {
        if (league_num == CHAMPIONS_LEAGUE) {
            if (match_day <= 6) {
                return App.getContext().getString(R.string.group_stage_matchday_6);
            } else if (match_day == 7 || match_day == 8) {
                return App.getContext().getString(R.string.first_knockout_round);
            } else if (match_day == 9 || match_day == 10) {
                return App.getContext().getString(R.string.quarter_final);
            } else if (match_day == 11 || match_day == 12) {
                return App.getContext().getString(R.string.semi_final);
            } else {
                return App.getContext().getString(R.string.final_text);
            }
        } else {
            return App.getContext().getString(R.string.matchday) + String.valueOf(match_day);
        }
    }

    public static String getScores(int home_goals, int awaygoals) {
        if (home_goals < 0 || awaygoals < 0) {
            return " - ";
        } else {
            return String.valueOf(home_goals) + " - " + String.valueOf(awaygoals);
        }
    }

    public static int getTeamCrestByTeamName(String teamname) {
        if (teamname == null) {
            return R.drawable.no_icon;
        }
        switch (teamname) { //This is the set of icons that are currently in the app. Feel free to find and add more
            //as you go.
            case "Arsenal London FC":
                return R.drawable.arsenal;
            case "Manchester United FC":
                return R.drawable.manchester_united;
            case "Swansea City":
                return R.drawable.swansea_city_afc;
            case "Leicester City":
                return R.drawable.leicester_city_fc_hd_logo;
            case "Everton FC":
                return R.drawable.everton_fc_logo1;
            case "West Ham United FC":
                return R.drawable.west_ham;
            case "Tottenham Hotspur FC":
                return R.drawable.tottenham_hotspur;
            case "West Bromwich Albion":
                return R.drawable.west_bromwich_albion_hd_logo;
            case "Sunderland AFC":
                return R.drawable.sunderland;
            case "Stoke City FC":
                return R.drawable.stoke_city;
            default:
                return R.drawable.no_icon;
        }
    }
}
