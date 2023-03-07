package mapper

import org.apache.ibatis.annotations.Mapper
import test.Company

interface CompanyMapper {

    fun query(): List<Company>
}

interface PersonMapper

interface PersonGroupMapper