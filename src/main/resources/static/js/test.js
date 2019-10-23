var option = {
    url: "ajaxError",
    type: "post",
    async: false,
    success: function (data) {
        console.log(data);
        if (data.status == 200) {
        } else {
            alert(data.msg);
        }
    },
    error: function () {
    }
};

$.ajax(option)
