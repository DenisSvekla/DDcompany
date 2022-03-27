package dataBaseEntries;

import core.DataBaseService;
import org.apache.log4j.Logger;

import java.sql.ResultSet;

public class ForAvatarTable {
    public static Logger logger = Logger.getLogger(ForAvatarTable.class);

    DataBaseService dataBaseService;

    public ForAvatarTable(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public ResultSet getDataForChangeAvatarById() {

        logger.info("получаем информацию по id");

        String sql = "SELECT email, id, link\n" +
                "\tFROM public.\"forAvatar\";";

        return dataBaseService.executeQuery(sql);
    }

}
