
package com.example.tenantmanagementsystem.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tenantmanagementsystem.data.model.Tenant

@Dao
interface TenantDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTenant(tenant: Tenant)

    @Query("SELECT * FROM tenants ORDER BY name ASC")
    suspend fun getAllTenants(): List<Tenant>
}
