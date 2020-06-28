package com.devgrace.mytrackapp.repository

import com.devgrace.mytrackapp.db.Run
import com.devgrace.mytrackapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDAO
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllSortedByDate()
    fun getAllRunsSortedByDistance() = runDao.getAllSortedByDistance()
    fun getAllRunsSortedByTimeInMilles() = runDao.getAllSortedByTimeInMilles()
    fun getAllRunsSortedByAvgSpeed() = runDao.getAllSortedByAvgSpeed()
    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()
    fun getTotalDistanceInMeters() = runDao.getTotalDistanceInMeters()
    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()
    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()
}