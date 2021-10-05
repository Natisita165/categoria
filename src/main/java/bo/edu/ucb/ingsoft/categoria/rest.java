package bo.edu.ucb.ingsoft.categoria;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
public class RestCategory {
    List<Category> lista = new ArrayList<>();
    @GetMapping(path="/task", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Category> listAll() {
        return lista;
    }
    @PostMapping(path="/task", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Category listAll(@RequestBody Category task) {
        lista.add(task);
        return task;
    }
}