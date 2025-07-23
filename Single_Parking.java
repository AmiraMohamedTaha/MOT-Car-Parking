GetLatestValueOfSensor(66667, function(res) {
  res = JSON.parse(res);
  var status = res.currentNearnessLevel
  if (status > 0) {
    SetPluginParameterValue('image 1', 'Visible', '0');
    DrawPlugin('image 1');
  } else {
    SetPluginParameterValue('image 1', 'Visible', '1');
    DrawPlugin('image 1');
  }
});
