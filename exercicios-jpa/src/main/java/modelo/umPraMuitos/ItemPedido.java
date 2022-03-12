package modelo.umPraMuitos;

import modelo.basico.Produto;

import javax.persistence.*;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // A relação é sempre a partir da classe que estamos anotando, nesse caso são muitos(many) Itens de pedido para um (to one) pedido.
    private Pedido pedido;

    // devemos tomar cuidado para manipular as buscas entre LAZY e EAGER, pois pode impactar muito no desempenho, o EAGER traz os objetos pesquisados e todas as suas relações entre "pais e filhos"
    @ManyToOne(fetch = FetchType.EAGER) // Toda relação para um(um pra um, muitos pra um) por padrão o fetch é EAGER, quando é uma relação para muitos é LAZY
    private Produto produto;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Double preco;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido, Produto produto, Integer quantidade) {
        this.setPedido(pedido);
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        if (produto != null && this.preco == null) {
            this.setPreco(produto.getPreco());
        }
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
