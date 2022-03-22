package dataBaseEntries;

import core.DataBaseService;

import org.apache.log4j.Logger;

public class CompanyTable {
    public static Logger logger = Logger.getLogger(CompanyTable.class);

    DataBaseService dataBaseService;

    public CompanyTable(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public void createTable() {
        logger.info("Создаем таблицу Companies");

        String createTableSQL = "CREATE TABLE Companies (" +
                "id SERIAL PRIMARY KEY, " +
                "namecompany CHARACTER VARYING(50), " +
                "inn CHARACTER VARYING(12), " +
                "ogrn CHARACTER VARYING(13), " +
                "kpp CHARACTER VARYING(9)" +
                "phone CHARACTER VARYING(12)" +
                "address CHARACTER VARYING(12)" +
                ");";

        dataBaseService.executeSQL(createTableSQL);
    }

    public void dropTable() {
        logger.info("Удаляем таблицу Companies");

        String dropTableCustomersSQL = "DROP TABLE companies;";

        dataBaseService.executeSQL(dropTableCustomersSQL);
    }

    public void addCustomer(String nameCompany, String inn, String ogrn, String kpp, String phone, String address) {
        logger.info("Добавляем запист в таблицу companies");

        String insertTableSQL = "INSERT INTO public.companies(" +
                "nameCompany, inn, ogrn, kpp, phone, address)" +
                "VALUES ('" + nameCompany + "', '" + inn + "', '" + ogrn + "', " + kpp + ", '"+ phone +"'," +
                "'"+address+"');";


        dataBaseService.executeSQL(insertTableSQL);
    }

    public void deleteAllRecordsInCompanyTables () {
        logger.info("удаляем все записи из таблицы");

        String deleteAllRecords = "DELETE FROM companies";

        dataBaseService.executeSQL(deleteAllRecords);

    }




}
