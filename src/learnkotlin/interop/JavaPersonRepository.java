package learnkotlin.interop;

import java.util.List;

public interface JavaPersonRepository {

    JavaPerson findById(Integer id);

    List<JavaPerson> findAll();
}
