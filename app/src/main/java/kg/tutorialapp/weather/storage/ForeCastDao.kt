package kg.tutorialapp.weather.storage

import androidx.lifecycle.LiveData
import androidx.room.*
import io.reactivex.Completable
import io.reactivex.Single
import kg.tutorialapp.weather.models.ForeCast

@Dao
interface ForeCastDao {

    //@Insert @Update @Delete @Query
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(foreCast: ForeCast)

    @Update
    fun update(foreCast: ForeCast): Completable

    @Delete
    fun delete(foreCast: ForeCast): Completable

    @Query("select * from ForeCast")
    fun getAll(): LiveData<ForeCast>

    @Query("select * from ForeCast where id = :id")
    fun getById(id: Long): Single<ForeCast>

    @Query("delete from ForeCast")
    fun deleteAll(): Completable
}