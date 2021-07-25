$(document).ready(()=>{
    $('.form-fields').velocity({translateY:"50%"})
    $('.form-fields2').velocity({translateY:"25%"})
    $('.form-fields').velocity({translateX:"115%"})
    $('.title2').velocity({translateY:"100%"})
    $('.login-container').velocity({translateX:"10%"})
    setInterval(()=>{
        playAnimation();
    },10000)
    playAnimation();



})
function playAnimation(){
    setTimeout(()=>{
        $('#signUpBtn').trigger('click');
    },2000)
    setTimeout(()=>{
        $('#submitFormSignUp').trigger('click');
    },4000)
    setTimeout(()=>{
        $('#loginBtn').trigger('click');
    },6000)
    setTimeout(()=>{
        $('#submitFormLogin').trigger('click');
    },8000)

}
$('#signUpBtn').on('click',()=>{
    $('.login-container').velocity({translateX:"100%"},{
        begin:()=>{
            $('.form-fields').velocity({translateX:"-100%"})
            $('.form-fields2').velocity({translateX:"-100%"})
            $('.title').velocity({translateY:"100%"})
            $('.title2').velocity({translateY:"0"})
        },
        complete:()=>{
            $('.title2').velocity({translateY:"0"})
            $('.login-content').velocity({translateX:"-100%"})
            $('input').val("");
        }

    });

    $('.login-content').velocity({translateX:"-100%"})
})

$('#loginBtn').on('click',()=>{

    $('.login-container').velocity({translateX:"10%"},{
        begin:()=>{
            $('.form-fields2').velocity({translateX:"100%"})
            $('.form-fields').velocity({translateX:"115%"})
            $('.title').velocity({translateY:"0"})
            $('.title2').velocity({translateY:"100%"})
        },complete:()=>{
            $('.title').velocity({translateY:"0"})
            $('input').val("");
        }

    });
    $('.login-content').velocity({translateX:"0"})


})
$('#submitFormLogin').on('click',()=>{
    $('.form-fields').find('.input-Fields').velocity("callout.shake");

})
$('#submitFormSignUp').on('click',()=>{
    $('.form-fields2').find('.input-Fields').velocity("callout.shake");

})