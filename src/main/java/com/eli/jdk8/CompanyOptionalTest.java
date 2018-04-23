package com.eli.jdk8;

import java.util.*;

/**
 * Created by pekah on 2018/2/12.
 */
public class CompanyOptionalTest {

    public static void main(String[] args) {
        Employ zhangsan = new Employ("zhangsan");
        Employ lisi = new Employ("lisi");

        Company company = new Company();
        company.setEmployList(Arrays.asList(zhangsan, lisi));

        CompanyOptionalTest cot = new CompanyOptionalTest();
        cot.getEmployList(company).forEach(employ -> System.out.println(employ.getName()));

        System.out.println("-----------------");

        cot.getEmployList(null).forEach(employ -> System.out.println(employ.getName()));
    }

    private List<Employ> getEmployList(Company company){
        Optional<Company> companyOptional = Optional.ofNullable(company);
        return companyOptional.map(theCompany -> theCompany.getEmployList()).orElse(Collections.emptyList());
    }
}
