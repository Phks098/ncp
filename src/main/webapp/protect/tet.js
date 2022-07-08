//버튼에 해당하는 요소를 찾아 대입한 변수이다.
const btnInfo = document.querySelector(".btnInfo");
const btnSetting1 = document.querySelector(".btnSetting1");
const contentsSetting1 = document.querySelector(".contents-setting1");
const btnSetting2 = document.querySelector(".btnSetting2");
const contentsSetting2 = document.querySelector(".contents-setting2");
const contentsInfo = document.querySelector(".contents-info");



btnInfo.addEventListener("click",()=>{
	contentsSetting1.classList.remove("show");
	contentsSetting2.classList.remove("show");
	
	if (!contentsInfo.classList.contains("show")) {
		contentsInfo.classList.add("show");
	}
});


btnSetting1.addEventListener("click", ()=>{
	contentsInfo.classList.remove("show");
	contentsSetting2.classList.remove("show");
	
	if(!contentsSetting1.classList.contains("show")){
		contentsSetting1.classList.add("show");
	}
});

btnSetting2.addEventListener("click", ()=>{
	contentsInfo.classList.remove("show");
	contentsSetting1.classList.remove("show");
	
	if(!contentsSetting2.classList.contains("show")){
		contentsSetting2.classList.add("show");
	}
});

