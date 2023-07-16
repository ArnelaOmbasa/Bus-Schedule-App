/*Dao*/
package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import java.util.concurrent.Flow

@Dao
interface BusScheduleDao {
    @Query("SELECT * FROM schedule ORDER BY arrival_time ASC")
    fun getAll(): kotlinx.coroutines.flow.Flow<List<BusSchedule>>

    @Query("SELECT * FROM schedule WHERE stop_name=:stopName ORDER BY arrival_time ASC")
    fun getByStopName(stopName: String): kotlinx.coroutines.flow.Flow<List<BusSchedule>>
}