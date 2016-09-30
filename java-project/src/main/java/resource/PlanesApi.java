
package resource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import org.inra.planes.api.model.Plane;
import org.inra.planes.api.model.Plane_;
import org.inra.planes.api.resource.PlanesResource.GetPlanesByIdResponse;
import org.inra.planes.api.resource.PlanesResource.GetPlanesResponse;

/**
 *
 * @author ryahiaoui
 */

@Path("/planes")
public class PlanesApi // implements PlanesResource 
{

    @GET
    @Produces({
        "application/json"
    })
    public Response planes(BigDecimal page) throws Exception {
        
        BigDecimal nbPage = page ;

        Plane plane_1 = new Plane() ;
        plane_1.setModel("Boeing 737") ;
        plane_1.setEngines(2.0) ;
        plane_1.setType("Short range, narrow body jet") ;
        plane_1.setSeats(189.0) ;
        plane_1.setSpeedMilesPh(560.0) ;
        plane_1.setAltitudeFeet(41000.0) ;
        
        Plane plane_2 = new Plane() ;
        plane_2.setModel("Boeing 757") ;
        plane_2.setEngines(2.0) ;
        plane_2.setType("Medium range, narrow body jet") ;
        plane_2.setSeats(289.0) ;
        plane_2.setSpeedMilesPh(540.0) ;
        plane_2.setAltitudeFeet(42000.0) ;
        
        List<Plane> list = new ArrayList<>() ;
        list.add(plane_1);
        list.add(plane_2);
        
        GenericEntity<List<Plane>> lt = new GenericEntity<List<Plane>>(list) {
        };
        
        return Response.ok(lt).build();
        // return GetPlanesResponse.withJsonOK(lt) ;
    }

    /**
     * 
     * @param id
     *     id Plane
     * @return 
     * @throws java.lang.Exception
     */
    @GET
    @Path("{id}")
    @Produces({
        "application/json"
    })
    public GetPlanesByIdResponse getPlanesById(Integer id) throws Exception {
        
        //int searchByID = id ;
        
        Plane_ plane = new Plane_();
        plane.setModel("Boeing 737");
        plane.setEngines(2.0);
        plane.setType("Short range, narrow body jet");
        plane.setSeats(189.0);
        plane.setSpeedMilesPh(560.0);
        plane.setAltitudeFeet(41000.0);
               
        return GetPlanesByIdResponse.withJsonOK(plane) ;
    }

    public PlanesApi() {
    }

    public GetPlanesResponse getPlanes(BigDecimal page) throws Exception {
       
        /*
        BigDecimal nbPage = page ;

        Plane plane_1 = new Plane() ;
        plane_1.setModel("Boeing 737") ;
        plane_1.setEngines(2.0) ;
        plane_1.setType("Short range, narrow body jet") ;
        plane_1.setSeats(189.0) ;
        plane_1.setSpeedMilesPh(560.0) ;
        plane_1.setAltitudeFeet(41000.0) ;
        
        Plane plane_2 = new Plane() ;
        plane_2.setModel("Boeing 757") ;
        plane_2.setEngines(2.0) ;
        plane_2.setType("Medium range, narrow body jet") ;
        plane_2.setSeats(289.0) ;
        plane_2.setSpeedMilesPh(540.0) ;
        plane_2.setAltitudeFeet(42000.0) ;
        
        List<Plane> list = new ArrayList<>() ;
        list.add(plane_1) ;
        list.add(plane_2) ;
        
        return GetPlanesResponse.withJsonOK(list) ;
         
        */
        
        return null ;
    }
        
}
