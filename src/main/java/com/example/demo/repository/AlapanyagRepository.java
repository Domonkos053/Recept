package com.example.demo.repository;

import com.example.demo.db.model.Alapanyag;
import org.apache.ibatis.annotations.*;

import java.util.List;


    @Mapper

    public interface AlapanyagRepository {
        @Select("select * from  alapanyag")
        public static List<Alapanyag> findAll() {
            return null;
        }

        @Select("SELECT * FROM  alapanyag WHERE azonosito=#{id}")
        public Alapanyag findById(long id);

        @Delete("Delete from alapanyag WHERE azonosito=#{id}")
        public int deleteById(long id);

        @Insert("Insert into  alapanyag(nev) " +
                "values (#{nev})")
        public int insert(String nev);

        @Update("Update  alapanyag set" + " nev=#{nev} where azonosito=#{id}")
        public int update(String nev, long id);
}
