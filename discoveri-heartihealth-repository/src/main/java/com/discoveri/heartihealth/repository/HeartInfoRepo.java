package com.discoveri.heartihealth.repository;

import java.util.List;

import com.discoveri.heartihealth.dto.CardioArrestDetection;
import com.discoveri.heartihealth.dto.GetTotalPredictionByPeriod;
import com.discoveri.heartihealth.dto.IntervalPrediction;
import com.discoveri.heartihealth.dto.LivePrediction;
import com.discoveri.heartihealth.dto.SymptomPrediction;
import com.discoveri.heartihealth.exceptions.HeartiExceptions;

public interface HeartInfoRepo {

	List<IntervalPrediction> weeklyReport() throws HeartiExceptions;

	List<IntervalPrediction> yearlyPredictions() throws HeartiExceptions;

	List<IntervalPrediction> monthlyReport() throws HeartiExceptions;

	List<SymptomPrediction> getChestPainDetection(String memberid) throws HeartiExceptions;

	List<SymptomPrediction> getBloodPressureDetection(String memberid) throws HeartiExceptions;

	List<SymptomPrediction> getCholesterolDetection(String memberid) throws HeartiExceptions;

	List<LivePrediction> getLivePrediction(String memberid) throws HeartiExceptions;

	LivePrediction getLivePredictionBySymptom(String memberid, String symptomType) throws HeartiExceptions;

	List<CardioArrestDetection> totalCardioArrestDetection(String memberid) throws HeartiExceptions;

	List<GetTotalPredictionByPeriod> getTotaPredictionByPeriod(String interval) throws HeartiExceptions;

	List<GetTotalPredictionByPeriod> getTotalPredictionByWeekly() throws HeartiExceptions;

	List<GetTotalPredictionByPeriod> getTotalPredictionByMonthly() throws HeartiExceptions;

	List<GetTotalPredictionByPeriod> getTotalPredictionByYearly() throws HeartiExceptions;

	int getPredictionOfChestPainValueByDay(String memberid, int curDay) throws HeartiExceptions;

	int getPredictionOfBloodPressureByDay(String memberid, int curDay) throws HeartiExceptions;

	int getPredictionOfCholesterolByDay(String memberid, int curDay) throws HeartiExceptions;
}
