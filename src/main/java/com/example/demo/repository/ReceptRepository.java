package com.example.demo.repository;

import com.example.demo.db.model.Recept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper

public interface ReceptRepository {
    @Select("select * from recept")
    public List<Recept> findAll();

    @Select("SELECT * FROM recept WHERE azonosito=#{id}")
    public Recept findById(long id);

    @Delete("Delete from recept WHERE azonosito=#{id}")
    public int deleteById(long id);

    @Insert("Insert into recept(nev, leiras, kep)" +
            "values (#{nev},#{leiras},#{kep})")
    @Options (useGeneratedKeys = true, keyProperty = "azonosito")
    public int insert (Recept recept);
    /*public int insert(String nev, String leiras);*/

    @Update("Update recept set" + " nev=#{nev}, leiras=#{leiras} where azonosito=#{id}")
    public int update(String nev, String leiras, long id);

}
