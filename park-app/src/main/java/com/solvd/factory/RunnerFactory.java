package com.solvd.factory;

import java.util.logging.Logger;

public class RunnerFactory {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(RunnerFactory.class.getName());
        logger.info("Start");
        StaffFactory staffFactory = new StaffFactory();
        IStaff investigator = staffFactory.getStaff("investigator");
        logger.info("Is investigator: " + investigator.isInvestigator());
        logger.info("Is conservation: " + investigator.isConservation());
        logger.info("Is vigilance: " + investigator.isVigilance());
        logger.info("End");

        logger.info("Start");
        IStaff conservation = staffFactory.getStaff("conservation");
        logger.info("Is investigator: " + conservation.isInvestigator());
        logger.info("Is conservation: " + conservation.isConservation());
        logger.info("Is vigilance: " + conservation.isVigilance());
        logger.info("End");
    }
    
}
