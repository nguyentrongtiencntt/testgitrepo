package iuh;

import java.util.Random;

public class RentalRobot {
    enum eState
    {
        STATE_WAITING,
        STATE_RECEIVING_FORM,
        STATE_RENT_APARTMENT,
        STATE_FULL_RENTED
    };

    int mNumberOfApartments;
    eState mState;
    Random mRandomGenerator = new Random();

    public RentalRobot(int numberOfApartments)
    {
        mNumberOfApartments = numberOfApartments;
        //mState = eState.STATE_WAITING;
        mState = eState.STATE_RECEIVING_FORM;
    }

    void getForm(){
        switch (mState)
        {
            case STATE_WAITING:
                mState = eState.STATE_RECEIVING_FORM;
                System.out.println("Thanks for the form.\n");
                break;
            case STATE_RECEIVING_FORM:
                System.out.println("We already got your form.\n");
                break;
            case STATE_RENT_APARTMENT:
                System.out.println("Hang on, we’re renting you an apartment.\n");
                break;
            case STATE_FULL_RENTED:
                System.out.println("Sorry, we're fully rented.\n");
                break;
            default:
                break;
        }
    }

    void checkForm()    {
        switch (mState)
        {
            case STATE_WAITING:
                System.out.println("You have to submit an form.\n");
                break;
            case STATE_RECEIVING_FORM:
            {
                // simulate the form checking

                boolean isFormOk = mRandomGenerator.nextInt(10) > 5;

                // check result
                if (isFormOk) {
                    System.out.println("Congratulations, you were approved.\n");
                    mState = eState.STATE_RENT_APARTMENT;
                    rentApartment();
                }
                else {
                    System.out.println("Sorry, you were not approved.\n");
                    mState = eState.STATE_WAITING;
                }
                break;
            }
            case STATE_RENT_APARTMENT:
                System.out.println("Hang on, we’re renting you an apartment.\n");
                break;
            case STATE_FULL_RENTED:
                System.out.println("Sorry, we're fully rented.\n");
                break;
            default:
                break;
        }
    }

    void rentApartment()
    {
        switch (mState)
        {
            case STATE_WAITING:
                mState = eState.STATE_RECEIVING_FORM;
                System.out.println("Thanks for the form.\n");
                break;
            case STATE_RECEIVING_FORM:
                System.out.println("You must have your form checked.\n");
                break;
            case STATE_RENT_APARTMENT:
                System.out.println("Renting you an apartment....\n");
                mNumberOfApartments--;
                dispenseKeys();
                break;
            case STATE_FULL_RENTED:
                System.out.println("Sorry, we're fully rented.\n");
                break;
            default:
                break;
        }
    }

    void dispenseKeys()
    {
        switch (mState)
        {
            case STATE_WAITING:
                System.out.println("You have to submit an form.\n");
                break;
            case STATE_RECEIVING_FORM:
                System.out.println("You must have your form checked.\n");
                break;
            case STATE_RENT_APARTMENT:
                System.out.println("Here are your keys!\n");
                if (mNumberOfApartments > 0) {
                    mState = eState.STATE_FULL_RENTED;
                }
                else {
                    mState = eState.STATE_WAITING;
                }
                break;
            case STATE_FULL_RENTED:
                System.out.println("Sorry, we're fully rented.\n");
                break;
            default:
                break;
        }
    }
}

