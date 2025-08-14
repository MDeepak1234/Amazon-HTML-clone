let modeb=document.querySelector("#mode");
let body=document.querySelector("body");
let cmode="light";
modeb.addEventListener("click",() => {
    if(cmode==="light"){
        cmode="dark";
        body.classList.add("dark");
        body.classList.remove("light");
    }
    else{
        cmode="light";
        body.classList.add("light");
        body.classList.remove("dark");
    }
    console.log(cmode);
});