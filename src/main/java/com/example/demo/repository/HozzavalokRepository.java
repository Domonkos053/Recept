package com.example.demo.repository;

import com.example.demo.db.model.Hozzavalo;
import com.example.demo.db.model.Recept;
import org.apache.ibatis.annotations.*;

import java.util.List;

    @Mapper

    public interface HozzavalokRepository {
        @Select("select * from  hozzavalo")
        public static List<Hozzavalo> findAll() {
            return null;
        }

        @Select("SELECT * FROM  hozzavalo WHERE azonosito=#{id}")
        public Hozzavalo findById(long id);

        @Delete("Delete from  hozzavalo WHERE azonosito=#{id}")
        public int deleteById(long id);

        @Insert("Insert into  hozzavalo(mennyiseg,alapanyag_azonosito, recept_azonosito)" +
                "values (#{mennyiseg},#{alapanyagAzonosito},#{receptAzonosito})")
        @Options (useGeneratedKeys = true, keyProperty = "azonosito")
        public int insert (Hozzavalo hozzavalo);
       /* public int insert(long mennyiseg,long alapanyagAzonosito, long receptAzonosito);*/

        @Update("Update  hozzavalo set" + " mennyiseg=#{mennyiseg} where azonosito=#{id}")
        public int update(long mennyiseg, long id);

        @Select("select * from hozzavalo where recept_azonosito=#{id}")
        public List<Hozzavalo> findByReceptAzonosito(long id);
    }



