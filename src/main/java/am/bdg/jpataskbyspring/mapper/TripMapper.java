package am.bdg.jpataskbyspring.mapper;

import am.bdg.jpataskbyspring.dao.TripDao;
import am.bdg.jpataskbyspring.entity.TripEntity;

/**
 * Created by User on 13.11.2020.
 */
@org.mapstruct.Mapper(componentModel = "spring")
public interface TripMapper extends Mapper<TripEntity, TripDao> {
}
