package modelo.umPraMuitos;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date data;

    // devemos tomar cuidado para manipular as buscas entre LAZY e EAGER, pois pode impactar muito no desempenho, a busca com LAZY traz somente os dados do objeto pesquisado, o EAGER traz os objetos pesquisados e todas as suas relações entre "pais e filhos"
    @OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER) // por padrão o fetch de relação para muitos(um para muitos ou muitos para muitos) é LAZY
    private List<ItemPedido> itens;

    public Pedido() {
        this(new Date()); // automaticamente será criada uma data
    }

    public Pedido(Date data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
