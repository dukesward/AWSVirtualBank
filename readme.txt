login url:http://localhost:8081/private/v1/customer/login

Succcess flow:
request:
{
	"username":"abc",
	"password":"123"
}
response:
{
    "statusCode": 0,
    "data": "success",
    "errorCode": null,
    "errorMsg": null
}

Failure flow:
request:
{
	"username":"abc",
	"password":"124"
}
response:
{
    "statusCode": -1,
    "data": "failure",
    "errorCode": "99",
    "errorMsg": "user not found"
}
