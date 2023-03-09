import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fitnessapp.clearfit.main.enums.WorkOutType;
import com.fitnessapp.clearfit.main.model.Center;
import com.fitnessapp.clearfit.main.model.Exercise;
import com.fitnessapp.clearfit.main.model.Slot;
import com.fitnessapp.clearfit.main.model.TimeSlot;

public class ExerciseTest {
    public static void main(String[] args) throws JsonProcessingException {
        TimeSlot timeSlot = new TimeSlot(6, 7);
        Slot slot = new Slot(timeSlot, 100);
        Center center = new Center("kormangla", slot, WorkOutType.WEIGHTS);
        Exercise ex = new Exercise(center, WorkOutType.WEIGHTS);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(ex));

        TimeSlot timeSlot1 = new TimeSlot(7, 8);
        Slot slot1 = new Slot(timeSlot1, 150);
        Center center1 = new Center("kormangla", slot1, WorkOutType.YOGA);
        Exercise ex1 = new Exercise(center1, WorkOutType.YOGA);
        ObjectMapper objectMapper1 = new ObjectMapper();
        System.out.println(objectMapper1.writeValueAsString(ex1));

        TimeSlot timeSlot2 = new TimeSlot(8, 9);
        Slot slot2 = new Slot(timeSlot2, 200);
        Center center2 = new Center("kormangla", slot2, WorkOutType.CARDIO);
        Exercise ex2 = new Exercise(center2, WorkOutType.CARDIO);
        ObjectMapper objectMapper2 = new ObjectMapper();
        System.out.println(objectMapper2.writeValueAsString(ex2));

        TimeSlot timeSlot3 = new TimeSlot(18, 19);
        Slot slot3 = new Slot(timeSlot3, 100);
        Center center3 = new Center("Bellandur", slot3, WorkOutType.CARDIO);
        Exercise ex3 = new Exercise(center3, WorkOutType.CARDIO);
        ObjectMapper objectMapper3 = new ObjectMapper();
        System.out.println(objectMapper3.writeValueAsString(ex3));


    }

}
  /*/register/workOuts

    curl --location --request POST 'http://localhost:8081/v1/fitness-service/register/workOuts' \
--header 'Content-Type: application/json' \
--data-raw '{"center":{"location":"kormangla","slot":{"timeSlot":{"start":6,"end":7},"numberOfSlot":100},"type":"WEIGHTS"},"type":"WEIGHTS"}'
{
    "center": {
        "location": "kormangla",
        "slot": {
            "timeSlot": {
                "start": 6,
                "end": 7
            },
            "numberOfSlot": 100
        },
        "type": "WEIGHTS"
    },
    "type": "WEIGHTS"
}
     */

  /*
        curl --location --request POST 'http://localhost:8081/v1/fitness-service/register/workOuts' \
--header 'Content-Type: application/json' \
--data-raw '{"center":{"location":"kormangla","slot":{"timeSlot":{"start":8,"end":9},"numberOfSlot":200},"type":"CARDIO"},"type":"CARDIO"}'
        {
    "center": {
        "location": "kormangla",
        "slot": {
            "timeSlot": {
                "start": 8,
                "end": 9
            },
            "numberOfSlot": 200
        },
        "type": "CARDIO"
    },
    "type": "CARDIO"
}
         */

/*
curl --location --request POST 'http://localhost:8081/v1/fitness-service/register/workOuts' \
--header 'Content-Type: application/json' \
--data-raw '{"center":{"location":"kormangla","slot":{"timeSlot":{"start":6,"end":7},"numberOfSlot":100},"type":"WEIGHTS"},"type":"WEIGHTS"}'

{
    "center": {
        "location": "kormangla",
        "slot": {
            "timeSlot": {
                "start": 6,
                "end": 7
            },
            "numberOfSlot": 100
        },
        "type": "WEIGHTS"
    },
    "type": "WEIGHTS"
}
 */

/**
 * Added these to the list
 * {"center":{"location":"kormangla","slot":{"timeSlot":{"start":6,"end":7},"numberOfSlot":100},"type":"WEIGHTS"},"type":"WEIGHTS"}
 * {"center":{"location":"kormangla","slot":{"timeSlot":{"start":7,"end":8},"numberOfSlot":150},"type":"YOGA"},"type":"YOGA"}
 * {"center":{"location":"kormangla","slot":{"timeSlot":{"start":8,"end":9},"numberOfSlot":200},"type":"CARDIO"},"type":"CARDIO"}
 * {"center":{"location":"Bellandur","slot":{"timeSlot":{"start":18,"end":19},"numberOfSlot":100},"type":"CARDIO"},"type":"CARDIO"}
 */
/*
Listout available workouts


 */