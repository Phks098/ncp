/*const navContentsInfoList = document.querySelector(".l-info")
const navContentsSettingList = document.querySelector(".l-setting")
const contentsInfo = document.querySelector(".contents-info")
const contentsSetting = document.querySelector(".contents-setting")
const contentsSetting1 = document.querySelector(".contents-setting1")




const btnInfo = document.querySelector(".btnInfo")//학생 기본정보 출력 div 을 출력 버튼
const btnSetting = document.querySelector(".btnSetting") //진로정체감검사 div
const btnSetting2 = document.querySelector(".btnSetting1")//진로개발준비도검사 div
const btnRegister = document.getElementById("btnRegister")
*/
/*const ncsSelect = document.getElementById("ncs")
const operatingMethodSelect = document.getElementById("operatingMethod")

const universityNumberInput = document.getElementById("universityNumber")

const startDay = document.getElementById("start_day");
const endDay = document.getElementById("end_day");*/
//버튼에 해당하는 요소를 찾아 대입한 변수이다.
const btnInfo = document.querySelector(".btnInfo");
const btnSetting1 = document.querySelector(".btnSetting1");
const btnSetting2 = document.querySelector(".btnSetting2");
const contentsSetting1 = document.querySelector(".contents-setting1");
const contentsSetting2 = document.querySelector(".contents-setting2");
const contentsInfo = document.querySelector(".contents-info");


btnInfo.addEventListener("click", () => {
	contentsSetting2.classList.remove("show");
	contentsSetting1.classList.remove("show");
	
	if (!contentsInfo.classList.contains("show")) {
		contentsInfo.classList.add("show");
	}
	
});

btnSetting1.addEventListener("click", () => {
	
	contentsSetting2.classList.remove("show");
	contentsInfo.classList.remove("show");


	if (!contentsSetting1.classList.contains("show")) {
		contentsSetting1.classList.add("show");
	}
	
});


btnSetting2.addEventListener("click", () => {
	
	contentsSetting1.classList.remove("show");
	contentsInfo.classList.remove("show");

	if (!contentsSetting2.classList.contains("show")) {
		contentsSetting2.classList.add("show");
	}
	
});




/*function searchPreferenceInformation() {
	request.open("Get", "./student/preferenceinformation?university_number=" + "201910823", true);
	request.onreadystatechange = searchProcess;
	request.send(null);
}

function updatePreferenceInformation() {
	var university_number = universityNumberInput.value;
	var NCS_part = ncsSelect.options[ncsSelect.selectedIndex].value
	var start_day = startDay.value;
	var end_day = endDay.value;
	var operating_method = operatingMethodSelect.options[operatingMethodSelect.selectedIndex].value

	var parameter = "university_number=" + university_number + "&" +
		"NCS_part=" + NCS_part + "&" +
		"start_day=" + start_day + "&" +
		"end_day=" + end_day + "&" +
		"operating_method=" + operating_method;

	console.log("./student/preferenceinformation?" + parameter);

	request.open("Put", "./student/preferenceinformation?" + parameter, true);
	request.onreadystatechange = searchProcess;
	request.send(null);
}

function searchProcess() {
	if (request.readyState == 4 && request.status == 200) {
		var result = request.responseText;
		result = JSON.parse(result);

		startDay.value = result.start_day;
		endDay.value = result.end_day;

		for (var i = 0; i < ncsSelect.options.length; i++) {
			if (ncsSelect.options[i].value == result.NCS_part) {
				ncsSelect.options[i].selected = true;
			}
		}

		for (var i = 0; i < operatingMethodSelect.options.length; i++) {
			if (operatingMethodSelect.options[i].value == result.operating_method) {
				operatingMethodSelect.options[i].selected = true;
			}
		}

		console.log(result);
		btnRegister.style.backgroundColor = "#5F86D6";
		btnRegister.disabled = false;

	} else {
		console.log("로딩즁");
		btnRegister.style.backgroundColor = "#D94D4D";
		btnRegister.disabled = true;
	}
}*/