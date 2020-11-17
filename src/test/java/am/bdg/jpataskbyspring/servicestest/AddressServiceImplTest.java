package am.bdg.jpataskbyspring.servicestest;

import am.bdg.jpataskbyspring.repository.AddressRepo;
import am.bdg.jpataskbyspring.service.AddressService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * Created by User on 15.11.2020.
 */
@SpringBootTest
public class AddressServiceImplTest {

    @Autowired
    private AddressService addressService;

    @MockBean
    private AddressRepo addressRepo;

    @Test
    public void getByIdTest(){

    }

    @Test
    public void getAllTest(){

    }

    @Test
    public void saveTest(){

    }

    @Test
    public void updateTest(){

    }

    @Test
    public void deleteTest(){

    }
}
//https://junit.org/junit5/docs/current/user-guide/#writing-tests