
package org.inra.planes.api.resource;

import java.math.BigDecimal;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.inra.planes.api.model.Error;
import org.inra.planes.api.model.Plane;
import org.inra.planes.api.model.Plane_;


/**
 * This resourceType defines the GET, POST, DELETE methods and their responses for a collection resource.
 * 
 * 
 */
@Path("planes")
public interface PlanesResource {


    /**
     * Retrieves a list of all in the collection.
     * 
     * @param page
     *     page number
     */
    @GET
    @Produces({
        "application/json"
    })
    PlanesResource.GetPlanesResponse getPlanes(
        @QueryParam("page")
        BigDecimal page)
        throws Exception
    ;

    /**
     * 
     * @param id
     *     id Plane
     */
    @GET
    @Path("{id}")
    @Produces({
        "application/json"
    })
    PlanesResource.GetPlanesByIdResponse getPlanesById(
        @PathParam("id")
        Integer id)
        throws Exception
    ;

    public class GetPlanesByIdResponse
        extends org.inra.planes.api.resource.support.ResponseWrapper
    {


        private GetPlanesByIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         *  e.g. { "Model": "Boeing 737", 
         *    "Engines": 2,
         *    "Type": "Short range, narrow body jet",
         *    "Seats": 189 ,
         *    "Speed-miles-ph": 560,
         *    "Altitude-feet": 41000
         * }
         * 
         * 
         * @param entity
         *     { "Model": "Boeing 737", 
         *        "Engines": 2,
         *        "Type": "Short range, narrow body jet",
         *        "Seats": 189 ,
         *        "Speed-miles-ph": 560,
         *        "Altitude-feet": 41000
         *     }
         *     
         */
        public static PlanesResource.GetPlanesByIdResponse withJsonOK(Plane_ entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PlanesResource.GetPlanesByIdResponse(responseBuilder.build());
        }

    }

    public class GetPlanesResponse
        extends org.inra.planes.api.resource.support.ResponseWrapper
    {


        private GetPlanesResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Resource successfully retrieved. e.g. [   
         *    { "Model": "Boeing 737",  
         *      "Engines": 2,
         *      "Type": "Short range, narrow body jet",
         *      "Seats": 189 ,
         *      "Speed-miles-ph": 560,
         *      "Altitude-feet": 41000
         *    },
         *    { "Model": "Boeing 757",  
         *      "Engines": 2,
         *      "Type": "Medium range, narrow body jet" ,
         *      "Seats": 289,
         *      "Speed-miles-ph": 550,
         *      "Altitude-feet": 42000
         *    },
         *    { "Model": "Boeing 777",
         *      "Engines": 2,
         *      "Type": "Long range, wide body jet",
         *      "Seats": 477,
         *      "Speed-miles-ph": 560,
         *      "Altitude-feet": 41000
         *    },
         *    { "Model": "Airbus A340",
         *      "Engines": 4,
         *      "Type": "Long range, wide body jet",
         *      "Seats": 400 ,
         *      "Speed-miles-ph": 560,
         *      "Altitude-feet": 41000
         *    }
         * ]
         * 
         * 
         * @param entity
         *     [   
         *        { "Model": "Boeing 737",  
         *          "Engines": 2,
         *          "Type": "Short range, narrow body jet",
         *          "Seats": 189 ,
         *          "Speed-miles-ph": 560,
         *          "Altitude-feet": 41000
         *        },
         *        { "Model": "Boeing 757",  
         *          "Engines": 2,
         *          "Type": "Medium range, narrow body jet" ,
         *          "Seats": 289,
         *          "Speed-miles-ph": 550,
         *          "Altitude-feet": 42000
         *        },
         *        { "Model": "Boeing 777",
         *          "Engines": 2,
         *          "Type": "Long range, wide body jet",
         *          "Seats": 477,
         *          "Speed-miles-ph": 560,
         *          "Altitude-feet": 41000
         *        },
         *        { "Model": "Airbus A340",
         *          "Engines": 4,
         *          "Type": "Long range, wide body jet",
         *          "Seats": 400 ,
         *          "Speed-miles-ph": 560,
         *          "Altitude-feet": 41000
         *        }
         *     ]
         *     
         */
        public static PlanesResource.GetPlanesResponse withJsonOK(List<Plane> entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PlanesResource.GetPlanesResponse(responseBuilder.build());
        }

        /**
         * Some server side error occurred.
         *  e.g. {
         *   "status": 500,
         *   "message": "Something went wrong while processing the request. Please contact the administrator.",
         *   "moreInfo": "https://api.yaas.io/patterns/errortypes.html",
         *   "type": "internal_service_error"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "status": 500,
         *       "message": "Something went wrong while processing the request. Please contact the administrator.",
         *       "moreInfo": "https://api.yaas.io/patterns/errortypes.html",
         *       "type": "internal_service_error"
         *     }
         *     
         */
        public static PlanesResource.GetPlanesResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PlanesResource.GetPlanesResponse(responseBuilder.build());
        }

    }

}
