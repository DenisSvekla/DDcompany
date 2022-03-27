package steps;


import models.Company;
import page.AddCompanyPage;
import page.CompaniesPage;

public class CompanySteps  {

    private CompaniesPage companiesPage = new CompaniesPage();
    private AddCompanyPage addCompanyPage;


    public CompaniesPage addCompany (Company company) {
        addCompanyPage = new AddCompanyPage(true);
        addCompanyPage.getNameCompanyField().val(company.getName());
        addCompanyPage.getInnField().val(company.getINN());
        addCompanyPage.getOgrnField().val(company.getOGRN());
        addCompanyPage.getKppField().val(company.getKPP());
        addCompanyPage.getPhoneField().val(company.getPhone());
        addCompanyPage.getAddCompanyButton().click();
    return companiesPage; }

    public CompaniesPage deleteCompany (Company company) {
        companiesPage = new CompaniesPage();
        companiesPage.getDeleteCompanyButton(company.getName()).click();
        return companiesPage;
    }


}
