import org.dozer.DozerBeanMapper;

public interface AbstractConverter <T,E> {
    default E convertToEntity (T dto, Class<E>entityClass){
      DozerBeanMapper mapper = new DozenBeanMapper();
      return mapper.map(dto, entityClass);
    }

    default T convertToDTO (T entity, Class<T>dtoClass){
      DozerBeanMapper mapper = new DozenBeanMapper();
      return mapper.map(entity, dtoClass);
    }

}
