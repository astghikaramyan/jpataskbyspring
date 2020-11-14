package am.bdg.jpataskbyspring.mapper;

import am.bdg.jpataskbyspring.dao.PassengerDao;
import am.bdg.jpataskbyspring.entity.PassengerEntity;

/**
 * Created by User on 13.11.2020.
 */
@org.mapstruct.Mapper(componentModel = "spring")
public interface PassengerMapper extends Mapper<PassengerEntity, PassengerDao> {
}
