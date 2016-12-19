import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.model.Diferenciada1;
import com.repository.Tabelas;


@Named
@ViewScoped
public class TesteBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
		
	@Inject
	private Tabelas tabelasRep;	
	
	private List<Diferenciada1> diferenciada1 = new ArrayList<Diferenciada1>();
	
	
//	public void porEntrada(){
//		diferenciada1 = tabelasRep.porEntrada(3);
//	}
	
	
	public List<Diferenciada1> getDiferenciada1() {
		return diferenciada1;
	}
}
