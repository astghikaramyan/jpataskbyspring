package am.bdg.jpataskbyspring.mapper;

import am.bdg.jpataskbyspring.dao.AddressDao;
import am.bdg.jpataskbyspring.entity.AddressEntity;

/**
 * Created by User on 13.11.2020.
 */
@org.mapstruct.Mapper(componentModel = "spring")
public interface AddressMapper extends Mapper<AddressEntity, AddressDao> {
}
