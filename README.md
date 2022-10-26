# account-opening-service
User stroy : Create account opening microservice 

1-ACCOUNT OPENING MS: 
when customer wants to open account then this ms will take care of opening bank account , it apply few business validation and creates account .


CRUD Operation : 
account/add  : (@RequestBody Account account)
account/get/{account_id}
account/getall
account/delete/{account_id} 


Entity Class:
 ACCOUNT_DETAILS 

    @Id
    @GeneratedValue
    Account no, Name, current address, permanent address, PAN number, ADHAR no, amount

    Need to validate PAN number and ADHAR it should be valid before creating account

STEP 1: Create Branch from Master

git checkout create_account_richa

