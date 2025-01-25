package academia.SpringBoaForma.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_alunos")
public class alunoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idAluno;
}
