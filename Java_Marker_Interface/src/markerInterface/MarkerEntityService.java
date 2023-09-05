package markerInterface;

public class MarkerEntityService {
	public boolean save(Object object) throws InvalidEntityFoundException {
		return new MarkerEntityDAO().save(object);
		
	}

}
