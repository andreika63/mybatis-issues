package test

import mapper.CompanyMapper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@ExtendWith(SpringExtension::class)
@SpringBootTest(classes = [Application::class])
class SpringBootTest(@Autowired val companyMapper: CompanyMapper) {

    @Test
    fun getCompanies() {
        val query = companyMapper.query()
        val dtoList = query.map {
            CompanyDto(
                    companyName = it.name,
                    directorName = it.director?.name,
                    directorGroupName = it.director?.group?.name,
            )
        }
        assertTrue { dtoList.size == 2 }

        assertEquals("Group-11", dtoList[1].directorGroupName)

    }


}