package am.bdg.jpataskbyspring.mapper;

import am.bdg.jpataskbyspring.dao.CompanyDao;
import am.bdg.jpataskbyspring.entity.CompanyEntity;

/**
 * Created by User on 13.11.2020.
 */
@org.mapstruct.Mapper(componentModel = "spring")
public interface CompanyMapper extends Mapper<CompanyEntity, CompanyDao> {
}
